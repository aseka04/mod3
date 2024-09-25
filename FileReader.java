public class FileReader {
    public String ReadFile(String filePath, boolean useBuffer = true, int bufferSize = 1024) {
        if (useBuffer)
        {
            // Чтение с буфером
        }
        if(filePath.equals("Download")){
            return "Download";
        }
        if(filePath.equals("Pictures")){
            return "Pictures";
        }
        else
        {
            // Чтение без буфера
        }
        return "file content";
    }
}


