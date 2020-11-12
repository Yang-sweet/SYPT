import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.*;
import org.apache.hadoop.io.IOUtils;
import org.apache.hadoop.yarn.webapp.hamlet2.Hamlet;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.UUID;


public class hdfs {

    //获取文件系统第一种方式
    @Test
    public void getFileSystem1() throws IOException {
        //获取configuration对象，封装了客户端或者服务器的配置
        Configuration configuration = new Configuration();
        //设置对象，指定要操作的文件系统
        configuration.set("fs.defaultFS","hdfs://192.168.8.115:8020");
        //获取我们指定的文件系统,获取朱姐点钟所有元数据信息
        FileSystem fileSystem = FileSystem.get(configuration);
        System.out.println("filesystem:"+fileSystem.toString());

    }


    //获取文件系统第二种方式
    @Test
    public void getFileSystem2() throws URISyntaxException, IOException {
        Configuration configuration = new Configuration();
        FileSystem fileSystem = FileSystem.get(new URI("hdfs://192.168.8.115:8020"), new Configuration());
        System.out.println(fileSystem.toString());
    }

    //获取文件系统第三种方式
    @Test
    public void getFileSystem3() throws URISyntaxException, IOException {
        Configuration configuration = new Configuration();
        FileSystem fileSystem = FileSystem.newInstance(new URI("hdfs://192.168.52.250:8020"), configuration);
        System.out.println(fileSystem.toString());
    }

    //获取文件系统第四种方式
    @Test
    public void getFileSystem4() throws  Exception{
        Configuration configuration = new Configuration();
        configuration.set("fs.defaultFS","hdfs://192.168.8.115:8020");
        FileSystem fileSystem = FileSystem.newInstance(configuration);
        System.out.println(fileSystem.toString());
    }

    @Test
    //获取目录下文件信息
    public void listMyFiles() throws URISyntaxException, IOException {
        //获取文件系统
        FileSystem fileSystem = FileSystem.get(new URI("hdfs://192.168.8.115:8020"), new Configuration());
        //获取指定目录下信息
        RemoteIterator<LocatedFileStatus> iterator = fileSystem.listFiles(new Path("/"), true);//true 递归 获取当前目录和子目录信息
        //遍历上面的迭代器
        while(iterator.hasNext()){
            //获取每一个文件详情信息
            LocatedFileStatus fileStatus = iterator.next();
            //获取每个文件存储路径/名字等
            System.out.println(fileStatus.getPath()+"---"+fileStatus.getPath().getName());
            //获取文件的block存储信息
            BlockLocation[] blockLocations = fileStatus.getBlockLocations();
            //打印每个文件的block数
            System.out.println(blockLocations.length);
            //打印每个block的副本存储信息

        }

    }

    //在hdfs上创建文件夹
    @Test
    public void mkdirsTest() throws URISyntaxException, IOException {
        //获取文件系统
        FileSystem fileSystem = FileSystem.get(new URI("hdfs://192.168.8.115:8080"), new Configuration());
        //创建文件夹
        fileSystem.mkdirs(new Path("/hello"));
        //创建文件
        fileSystem.create(new Path("/a.txt"));
    }
@Test
    public void downlocdFileText() throws URISyntaxException, IOException {
        Configuration conf = new Configuration();
        //获取文件系统
        FileSystem fileSystem = FileSystem.get(new URI("hdfs://192.168.8.115:8020"), new Configuration());
        //获取hdfs输入流
        FSDataInputStream inputStream = fileSystem.open(new Path("/test1/output/part-r-00001")); //下载文件路径

        FileOutputStream outputStream=new FileOutputStream(new File("/E://test5.txt"));
        BufferedReader d = new BufferedReader(new InputStreamReader(inputStream));
        //实现文件的复制
        IOUtils.copyBytes(inputStream,outputStream,conf);
//      IOUtils.copy(inputStream,outputStream);
        //关闭流
        IOUtils.closeStream(outputStream);
        IOUtils.closeStream(inputStream);
        fileSystem.close();

    }



    //文件下载
    @Test
    public void downlocdFileText1() throws URISyntaxException, IOException {
        //获取文件系统
        FileSystem fileSystem = FileSystem.get(new URI("hdfs://192.168.8.115:8020"), new Configuration());
        //获取hdfs输入流
        FSDataInputStream inputStream = fileSystem.open(new Path("/test1/output/part-r-00001")); //下载文件路径
        BufferedReader d = new BufferedReader(new InputStreamReader(inputStream));

        FileWriter fw=new FileWriter(new File("/E://test4.txt"));
        BufferedWriter bw=new BufferedWriter(fw);

        String line = null;
        String[] strarray=null;
        while ((line = d.readLine()) != null) {
            strarray = line.split(" ");
            for (int i = 0; i < strarray.length; i++) {
                System.out.println(strarray[i]);
//                System.out.print(" ");
            }
////
//            System.out.println(" ");
            for (int x = 0; x < strarray.length; x++) {
                bw.write(strarray[x]); // writes the bytes
            }
        }


//        //实现文件的复制
//        IOUtils.copy(inputStream,outputStream);
//        //关闭流
//        IOUtils.closeQuietly(inputStream);
//        IOUtils.closeQuietly(outputStream);
//        fileSystem.close();

    }

    //文件下载
//    @Test
//    public void downlocdFileText() throws URISyntaxException, IOException {
//        //获取文件系统
//        FileSystem fileSystem = FileSystem.get(new URI("hdfs://192.168.8.115:8020"), new Configuration());
//        //获取hdfs输入流
//        FSDataInputStream inputStream = fileSystem.open(new Path("/test1/output/part-r-00001")); //下载文件路径
//
//        BufferedReader d = new BufferedReader(new InputStreamReader(inputStream));
//        String line = null;
//        String[] strarray=null;
//        while ((line = d.readLine()) != null) {
//            strarray = line.split(" ");
//            for (int i = 0; i < strarray.length; i++) {
//                System.out.print(strarray[i]);
////                System.out.print(" ");
//
//            }
////
//            System.out.println(" ");
//
//        }
//
//        FileOutputStream outputStream = new FileOutputStream(new File("/E://test1.txt"));
//        BufferedWriter bWrite=new BufferedWriter(outputStream);
//        for (int x = 0; x < bWrite.length; x++) {
//            outputStream.write(bWrite[x]); // writes the bytes
//        }
//        os.close();
//
//
//        //实现文件的复制
//        IOUtils.copy(inputStream,outputStream);
//        //关闭流
//        IOUtils.closeQuietly(inputStream);
//        IOUtils.closeQuietly(outputStream);
//        fileSystem.close();
//
//    }

    //文件下载2
    @Test
    public void downlocdFileText2() throws URISyntaxException, IOException{

        String remoteJarName = UUID.randomUUID().toString()+".jar";
        System.out.println(remoteJarName);
        //获取文件系统
//        FileSystem fileSystem = FileSystem.get(new URI("hdfs://192.168.8.115:8020"), new Configuration());
//        fileSystem.copyToLocalFile(new Path("/test1/output1"),new Path("E://out1"));
//        fileSystem.close();
//        IOUtils.copyBytes();
    }

    @Test
    public static void cat() throws IOException {
        FileSystem fileSystem = null;
        try {
            fileSystem = FileSystem.get(new URI("hdfs://192.168.8.115:8020"), new Configuration());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        //获取hdfs输入流
        FSDataInputStream inputStream = fileSystem.open(new Path("/test1/input/input1.txt"));

        BufferedReader d = new BufferedReader(new InputStreamReader(inputStream));
        String line = null;
        while ((line = d.readLine()) != null) {
            String[] strarray = line.split(" ");
            for (int i = 0; i < strarray.length; i++) {
                System.out.print(strarray[i]);
                System.out.print(" ");

            }

            System.out.println(" ");

        }
        d.close();
        inputStream.close();
        fileSystem.close();
    }

    /**
     * 主函数
     */
    public static void main(String[] args) {
       ;


//        Configuration conf = new Configuration();
//        conf.set("fs.default.name", "hdfs://192.168.8.115:8020");
//        String remoteFilePath = "/test1/input/input1.txt"; // HDFS路径
//
//        try {
//            System.out.println("读取文件: " + remoteFilePath);
//            hdfs.cat();
//            System.out.println("\n读取完成");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

//    private void readHDFSFile(String filePath){
//        FSDataInputStream fsDataInputStream = null;
//
//        try {
//            Path path = new Path(filePath);
//            fsDataInputStream = this.getFiledSystem().open(path);
//            IOUtils.copyBytes(fsDataInputStream, System.out, 4096, false);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if(fsDataInputStream != null){
//                IOUtils.closeStream(fsDataInputStream);
//            }
//        }
//
//    }
    //文件上传
    @Test
    public void uplocdFileText() throws URISyntaxException, IOException{
        //获取文件系统
        FileSystem fileSystem = FileSystem.get(new URI("hdfs://192.168.8.115:8020"), new Configuration());
        fileSystem.copyFromLocalFile(new Path("E://test.txt"),new Path("/test1.txt"));
        fileSystem.close();
    }
    @Test
    public void downlocdFile() throws URISyntaxException, IOException{
        //获取文件系统
        FileSystem fileSystem = FileSystem.get(new URI("hdfs://192.168.8.115:8020"), new Configuration());
        fileSystem.copyToLocalFile(new Path("/test1/output1/part-r-00000"),new Path("E://output2/"));
        fileSystem.close();
    }
//    @Test
//    public void checkFile() throws Exception {
//        FileSystem fs = FileSystem.get(new URI("hdfs://192.168.8.115:8020"), new Configuration());
//        FSDataInputStream inStream = fs.open(new Path("/test1/output1/part-r-00001"));
//        BufferedReader br = new BufferedReader(new InputStreamReader(inStream, "UTf-8"));
//        StringBuffer buffer = new StringBuffer();
//        try {
//            String line;
//            line = br.readLine();
//
//            while (line != null) {
//                buffer.append(line).append("<br>");
//                System.out.println(buffer.toString());
//                line = br.readLine();
//            }
//        } finally {
//            br.close();
//            inStream.close();
//        }
//    }

//    private void readHDFSFile(String filePath){
//        FSDataInputStream fsDataInputStream = null;
//
//        try {
//            Path path = new Path(filePath);
//            fsDataInputStream = this.getFiledSystem().open(path);
//            IOUtils.copyBytes(fsDataInputStream, System.out, 4096, false);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if(fsDataInputStream != null){
//                IOUtils.closeStream(fsDataInputStream);
//            }
//        }
//
//    }
}
