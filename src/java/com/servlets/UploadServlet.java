package com.servlets;

import com.servlet.db.DB;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

@WebServlet(name = "UploadServlet", urlPatterns = {"/UploadServlet"})
@MultipartConfig(fileSizeThreshold=1024*1024*10,
        maxFileSize=1024*1024*1000,
        maxRequestSize=1024*1024*1000)
public class UploadServlet extends HttpServlet {

    PrintWriter out=null;
    Connection con=null;
    PreparedStatement ps=null;
    HttpSession session=null;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException,IOException{
        response.setContentType("text/plain;charset=UTF-8");
        try
        {
            out=response.getWriter();
            session=request.getSession(false);
            String folderName="resources";
            String uploadPath=request.getServletContext().getRealPath("")+File.separator+folderName;
            File dir=new File(uploadPath);
            if(!dir.exists())
            {
                dir.mkdirs();
            }
            Part filePart=request.getPart("file");//textbox value of name file.
            String firstName=request.getParameter("firstname");
            String fileName=filePart.getSubmittedFileName();
            String path=folderName +File.separator+fileName;
            System.out.println("fileName"+fileName);
            System.out.println("Path:"+uploadPath);
            System.out.println("Name"+ firstName);
            InputStream is=filePart.getInputStream();
            Files.copy(is, Paths.get(uploadPath+ File.separator +fileName),StandardCopyOption.REPLACE_EXISTING);
            
            try{
                con=DB.getConnection();
                System.out.println("connecction done");
                String sql="insert into ccoursematerial(name,filename,path) values(?,?,?)";
                ps=con.prepareStatement(sql);
                ps.setString(1,firstName);
                ps.setString(2, fileName);
                ps.setString(3,path);
                int status=ps.executeUpdate();
                if(status>0)
                {
                    session.setAttribute("fileName" , fileName);
                    String msg=""+ fileName +"File Uploaded successfully.....";
                    request.setAttribute("msg",msg);
                    RequestDispatcher rd=request.getRequestDispatcher("/success.jsp");
                    rd.forward(request, response);
                    System.out.println("file uploaded successfully");
                    System.out.println("Uploaded path :"+ uploadPath);
                }
                    
                }
            catch(SQLException e)
            {
                out.println("Exception :" + e);
                       System.out.println("Exception1 :" + e);
            }
            finally
            {
                try{
                    if(ps!=null){
                        ps.close();
                    }
                    if(con!=null){
                    con.close();
                    }
                }catch(SQLException e){
                out.println(e);
                }
                
            }
            } catch(IOException | ServletException e){
            out.println("Exception :"+ e);
            System.out.println("Exception2 :"+ e);
            }
           
    
            
        }
                    
    }
