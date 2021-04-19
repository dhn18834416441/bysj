package mall.util;
/**
 * 处理 Controller 中文件保存的问题
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ServletContextAware;

import mall.service.ConfigService;

import javax.print.DocFlavor.STRING;
import javax.servlet.ServletContext;
import java.io.File;
import java.util.Map;

@Component
public class FileUtil implements ServletContextAware {
    @Autowired
    public ConfigService configService;

    private ServletContext servletContext;

    @Override
    public void setServletContext(ServletContext servletContext) {
        this.servletContext = servletContext;
    }

    public void saveImg(UploadedImageFile uploadedImageFile, String type, String imgName) throws Exception {
        Map<String, String> config = configService.map();
        String relativeFolderPath = config.get("path_" + type + "_img");
        String path = servletContext.getRealPath(relativeFolderPath);
        File imageFolder = new File(path);
        if (!imageFolder.exists())
            imageFolder.mkdirs();
        File imageFile = new File(imageFolder, imgName);
        uploadedImageFile.getImage().transferTo(imageFile);
    }
}
