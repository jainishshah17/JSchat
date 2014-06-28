package com.jainishshah.www;
 
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
 
public class newprocess {
 
    public static void main(String a[]){
         
        InputStream is = null;
        ByteArrayOutputStream baos = null;
        List<String> commands = new ArrayList<String>();
        commands.add("ls");
        commands.add("-l");
       
        ProcessBuilder pb = new ProcessBuilder(commands);
        try {
            Process prs = pb.start();
            is = prs.getInputStream();
            byte[] b = new byte[1024];
            int size = 0;
            baos = new ByteArrayOutputStream();
            while((size = is.read(b)) != -1){
                baos.write(b, 0, size);
            }
            System.out.println(new String(baos.toByteArray()));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally{
            try {
                if(is != null) is.close();
                if(baos != null) baos.close();
            } catch (Exception ex){}
        }
    }
}