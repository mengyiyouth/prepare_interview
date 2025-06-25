package com.mengyi.jvm;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CustomeClassLoader extends ClassLoader {

    private String classPath;

    public CustomeClassLoader(String classPath, ClassLoader parent) {
        super(parent);
        this.classPath = classPath;
    }

    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        if(name.contains("com.mengyi.jvm")){
            return findClass(name);
        }else{
            return super.loadClass(name);
        }

    }

    @Override
    protected Class<?> findClass(String name) {
        String filePath = name.replace(".", "/") + ".class";
        Path path = Paths.get(this.classPath, filePath);
        byte[] classBytes = readClassBytes(path);
        return defineClass(name, classBytes, 0, classBytes.length);
    }

    private byte[] readClassBytes(Path path) {
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
             InputStream inputStream = Files.newInputStream(path)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }
            return baos.toByteArray();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }

}
