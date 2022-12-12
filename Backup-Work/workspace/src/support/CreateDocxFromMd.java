package support;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CreateDocxFromMd {

    private static String fileList = "E:\\my_files\\my_workspace\\wacnReplace\\wacn\\src\\customization\\file_list.txt";
    
    private static String psFile = "E:\\my_files\\mooncake\\toDoc.ps1";
    
        
    // update it
    private static String mdFilePath = "E:\\my_files\\mooncake\\mc-docs-pr.en-us\\articles\\active-directory\\develop";
    
    
    
    
    
    
    
    private static List<String> listFile = new ArrayList<String>();

    public static void readFileNameToList() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileList));
        String line = reader.readLine();

        while (line != null && !line.trim().equals("")) { 
            listFile.add(line);
            
            line = reader.readLine();
        }

        reader.close();
    }

    public static void writeCmdToFile(List<String> cmdList) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(psFile));
        for (String cmd : cmdList) {
            writer.write(cmd + "\n");
        }

        writer.close();
    }

    public static void main(String[] args) throws IOException {
        readFileNameToList();

        List<String> cmdList = new ArrayList<String>();
        cmdList.add("cd " + mdFilePath);

        for (String fileName : listFile) {
            String psCmd = "Get-ChildItem -Filter " + fileName + " | % {pandoc -s -S $_.name -o ($_.name.replace(\".md\",\"\") + \".docx\")}";
            cmdList.add(psCmd);
        }
        
        cmdList.add("pause;");

        writeCmdToFile(cmdList);
        
        System.out.println("Done"); 
        
    }

}
