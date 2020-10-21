/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlets;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sara
 */
@WebServlet(name = "CplusDownloadServlet", urlPatterns = {"/CplusDownloadServlet"})
public class CplusDownloadServlet extends HttpServlet {
public static int BUFFER_SIZE=1024*100;
    public static final String UPLOAD_DIR="cplus";
    public static String fileName=null;

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        fileName=request.getParameter("fileName");
        if(fileName==null ||fileName.equals("")){
        response.setContentType("text/html");
        response.getWriter().println("<h3> File "+fileName +"Is not Present......!</h3>");
        
        }
        else
        {
            String applicationPath=getServletContext().getRealPath("");
            String downloadPath=applicationPath +File.separator + UPLOAD_DIR;
            String filePath =downloadPath + File.separator +fileName;
            System.out.println(fileName);
            System.out.println(filePath);
            System.out.println("fileName" + fileName);
            System.out.println("fileName" + filePath);
            File file= new File(filePath);
            OutputStream outStream=null;
            FileInputStream inputStream=null;
            if(file.exists()){
            
                String mimeType="application/octet-stream";
                response.setContentType(mimeType);
                String headerKey="Content-Disposition";
                String headerValue=String.format("attachment; filename=\"%s\"", file.getName());
                response.setHeader(headerKey, headerValue);
                try
                {
                    outStream=response.getOutputStream();
                    inputStream=new FileInputStream(file);
                    byte[] buffer=new byte[BUFFER_SIZE];
                    int bytesRead= -1;
                    while((bytesRead =inputStream.read(buffer))!=-1){
                    outStream.write(buffer,0,bytesRead);
                    }
                }
                catch(IOException ioExobj){
                System.out.println("Exception While Performing The I/O Operation ?= "+ ioExobj.getMessage());
                }
                finally{
                    if(inputStream != null){
                    inputStream.close();
                    }
                    outStream.flush();
                    if(outStream!=null){
                    outStream.close();
                    }
                }
                    
            }
            else{
                response.setContentType("text/html");
                response.getWriter().println("<h3>File " + fileName +" is Not Present.....!</h3>");
            }
        }
        }
    }


