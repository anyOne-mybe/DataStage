
package com.guan.datastage.service.upload;

import java.io.File;
import java.util.List;

import javax.inject.Named;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.idea.it.web.upload.IFileUploadHandler;

/**
 * 类说明
 * 
 * @author ****
 * @date 2017年8月4日 新建
 */
@Named
public class ExcelUploadService implements IFileUploadHandler
{

    /**
     * 1M字节
     */
    private static final int BYTE_M = 1024 * 1024;

    @Override
    public void handle( List<FileItem> fileItems )
    {
        for ( FileItem file : fileItems )
        {
            byte[] fileName = file.getName().getBytes();

            try
            {
                String uploadName = new String( fileName, "utf-8" );
                System.out.println( uploadName );

                File writeFile = new File( "D:\\" + uploadName );

                file.write( writeFile );

            } catch ( Exception e )
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }

    }

    @Override
    public void configFileUpload( DiskFileItemFactory fileItemFactory,
            ServletFileUpload servletFileUpload )
    {
        fileItemFactory.setSizeThreshold( BYTE_M * 10 );
        fileItemFactory.setRepository( new File( "D:\\appUploads" ) );
        servletFileUpload.setFileSizeMax( BYTE_M * 100 );
    }

}
