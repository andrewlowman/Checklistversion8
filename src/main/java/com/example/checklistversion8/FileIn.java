package com.example.checklistversion8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;

public class FileIn {

    public ArrayList<Tracker> load(){
        ArrayList<Tracker> al = null;
        try{
            FileInputStream fileInputStream = new FileInputStream("/file11.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            al = (ArrayList<Tracker>)  objectInputStream.readObject();
           // System.out.println("AL" + al);
            fileInputStream.close();
            objectInputStream.close();
          // System.out.println("File read and closed");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return al;
    }

    public HashMap<String,Tracker> loadHashmapJan(){
        HashMap<String,Tracker> hm = null;
        try{
            FileInputStream fileInputStream = new FileInputStream("/fileJan.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            hm = (HashMap<String, Tracker>)  objectInputStream.readObject();
            // System.out.println("AL" + al);
            fileInputStream.close();
            objectInputStream.close();
            // System.out.println("File read and closed");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return hm;
    }

    public HashMap<String,Tracker> loadHashmapFeb(){
        HashMap<String,Tracker> hm = null;
        try{
            FileInputStream fileInputStream = new FileInputStream("/fileFeb.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            hm = (HashMap<String, Tracker>)  objectInputStream.readObject();
            // System.out.println("AL" + al);
            fileInputStream.close();
            objectInputStream.close();
            // System.out.println("File read and closed");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return hm;
    }
    public HashMap<String,Tracker> loadHashmapMarch(){
        HashMap<String,Tracker> hm = null;
        try{
            FileInputStream fileInputStream = new FileInputStream("/fileMarch.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            hm = (HashMap<String, Tracker>)  objectInputStream.readObject();
            // System.out.println("AL" + al);
            fileInputStream.close();
            objectInputStream.close();
            // System.out.println("File read and closed");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return hm;
    }
    public HashMap<String,Tracker> loadHashmapApril(){
        HashMap<String,Tracker> hm = null;
        try{
            FileInputStream fileInputStream = new FileInputStream("/fileApril2.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            hm = (HashMap<String, Tracker>)  objectInputStream.readObject();
            // System.out.println("AL" + al);
            fileInputStream.close();
            objectInputStream.close();
            // System.out.println("File read and closed");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return hm;
    }
    public HashMap<String,Tracker> loadHashmapMay(){
        HashMap<String,Tracker> hm = null;
        try{
            FileInputStream fileInputStream = new FileInputStream("/fileMay.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            hm = (HashMap<String, Tracker>)  objectInputStream.readObject();
            // System.out.println("AL" + al);
            fileInputStream.close();
            objectInputStream.close();
            // System.out.println("File read and closed");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return hm;
    }
    public HashMap<String,Tracker> loadHashmapJune(){
        HashMap<String,Tracker> hm = null;
        try{
            FileInputStream fileInputStream = new FileInputStream("/fileJune.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            hm = (HashMap<String, Tracker>)  objectInputStream.readObject();
            // System.out.println("AL" + al);
            fileInputStream.close();
            objectInputStream.close();
            // System.out.println("File read and closed");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return hm;
    }
    public HashMap<String,Tracker> loadHashmapJuly(){
        HashMap<String,Tracker> hm = null;
        try{
            FileInputStream fileInputStream = new FileInputStream("/fileJuly.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            hm = (HashMap<String, Tracker>)  objectInputStream.readObject();
            // System.out.println("AL" + al);
            fileInputStream.close();
            objectInputStream.close();
            // System.out.println("File read and closed");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return hm;
    }
    public HashMap<String,Tracker> loadHashmapAug(){
        HashMap<String,Tracker> hm = null;
        try{
            FileInputStream fileInputStream = new FileInputStream("/fileAug.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            hm = (HashMap<String, Tracker>)  objectInputStream.readObject();
            // System.out.println("AL" + al);
            fileInputStream.close();
            objectInputStream.close();
            // System.out.println("File read and closed");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return hm;
    }
    public HashMap<String,Tracker> loadHashmapSept(){
        HashMap<String,Tracker> hm = null;
        try{
            FileInputStream fileInputStream = new FileInputStream("/fileSept.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            hm = (HashMap<String, Tracker>)  objectInputStream.readObject();
            // System.out.println("AL" + al);
            fileInputStream.close();
            objectInputStream.close();
            // System.out.println("File read and closed");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return hm;
    }
    public HashMap<String,Tracker> loadHashmapOct(){
        HashMap<String,Tracker> hm = null;
        try{
            FileInputStream fileInputStream = new FileInputStream("/fileOct.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            hm = (HashMap<String, Tracker>)  objectInputStream.readObject();
            // System.out.println("AL" + al);
            fileInputStream.close();
            objectInputStream.close();
            // System.out.println("File read and closed");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return hm;
    }
    public HashMap<String,Tracker> loadHashmapNov(){
        HashMap<String,Tracker> hm = null;
        try{
            FileInputStream fileInputStream = new FileInputStream("/fileNov.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            hm = (HashMap<String, Tracker>)  objectInputStream.readObject();
            // System.out.println("AL" + al);
            fileInputStream.close();
            objectInputStream.close();
            // System.out.println("File read and closed");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return hm;
    }
    public HashMap<String,Tracker> loadHashmapDec(){
        HashMap<String,Tracker> hm = null;
        try{
            FileInputStream fileInputStream = new FileInputStream("/fileDec.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            hm = (HashMap<String, Tracker>)  objectInputStream.readObject();
            // System.out.println("AL" + al);
            fileInputStream.close();
            objectInputStream.close();
            // System.out.println("File read and closed");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return hm;
    }

    public String loadTitle(){
        String title = "";
        try{
            title = Files.readString(Path.of("/fileTitle.ser"));
        }catch(IOException i){
            i.printStackTrace();
        }

        return title;
    }

}
