package com.example.checklistversion8;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class FileOut implements Serializable {
    //Tracker tracker = new Tracker();

    public void save(ArrayList<Tracker> tracker){
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("/file10.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(tracker);
            objectOutputStream.close();
            fileOutputStream.close();
            //System.out.println("Wrote to the file");
        }catch(IOException i){
            i.printStackTrace();
        }
        //System.out.println("I am saving");
    }

    public void saveHashmapJan(HashMap<String,Tracker> hm){
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("/fileJan.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(hm);
            objectOutputStream.close();
            fileOutputStream.close();
            //System.out.println("Wrote to the file");
        }catch(IOException i){
            i.printStackTrace();
        }
    }

    public void saveHashmapFeb(HashMap<String,Tracker> hm){
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("/fileFeb.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(hm);
            objectOutputStream.close();
            fileOutputStream.close();
            //System.out.println("Wrote to the file");
        }catch(IOException i){
            i.printStackTrace();
        }
    }

    public void saveHashmapMarch(HashMap<String,Tracker> hm){
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("/fileMarch.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(hm);
            objectOutputStream.close();
            fileOutputStream.close();
            //System.out.println("Wrote to the file");
        }catch(IOException i){
            i.printStackTrace();
        }
    }
    public void saveHashmapApril(HashMap<String,Tracker> hm){
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("/fileApril2.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(hm);
            objectOutputStream.close();
            fileOutputStream.close();
            //System.out.println("Wrote to the file");
        }catch(IOException i){
            i.printStackTrace();
        }
    }
    public void saveHashmapMay(HashMap<String,Tracker> hm){
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("/fileMay.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(hm);
            objectOutputStream.close();
            fileOutputStream.close();
            //System.out.println("Wrote to the file");
        }catch(IOException i){
            i.printStackTrace();
        }
    }
    public void saveHashmapJune(HashMap<String,Tracker> hm){
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("/fileJune.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(hm);
            objectOutputStream.close();
            fileOutputStream.close();
            //System.out.println("Wrote to the file");
        }catch(IOException i){
            i.printStackTrace();
        }
    }
    public void saveHashmapJuly(HashMap<String,Tracker> hm){
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("/fileJuly.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(hm);
            objectOutputStream.close();
            fileOutputStream.close();
            //System.out.println("Wrote to the file");
        }catch(IOException i){
            i.printStackTrace();
        }
    }

    public void saveHashmapAug(HashMap<String,Tracker> hm){
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("/fileAug.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(hm);
            objectOutputStream.close();
            fileOutputStream.close();
            //System.out.println("Wrote to the file");
        }catch(IOException i){
            i.printStackTrace();
        }
    }
    public void saveHashmapSept(HashMap<String,Tracker> hm){
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("/fileSept.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(hm);
            objectOutputStream.close();
            fileOutputStream.close();
            //System.out.println("Wrote to the file");
        }catch(IOException i){
            i.printStackTrace();
        }
    }
    public void saveHashmapOct(HashMap<String,Tracker> hm){
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("/fileOct.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(hm);
            objectOutputStream.close();
            fileOutputStream.close();
            //System.out.println("Wrote to the file");
        }catch(IOException i){
            i.printStackTrace();
        }
    }
    public void saveHashmapNov(HashMap<String,Tracker> hm){
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("/fileNov.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(hm);
            objectOutputStream.close();
            fileOutputStream.close();
            //System.out.println("Wrote to the file");
        }catch(IOException i){
            i.printStackTrace();
        }
    }

    public void saveHashmapDec(HashMap<String,Tracker> hm){
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("/fileDec.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(hm);
            objectOutputStream.close();
            fileOutputStream.close();
            //System.out.println("Wrote to the file");
        }catch(IOException i){
            i.printStackTrace();
        }
    }

    public void saveTitle(String title){
        try{
            FileWriter fileWriter = new FileWriter("/fileTitle.ser",false);
            fileWriter.write(title);
            fileWriter.close();
        }catch(IOException i){
            i.printStackTrace();
        }
    }

    /*public void load(){
        Tracker t = null;
        try{
            FileInputStream fileInputStream = new FileInputStream("/file2.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            t = (Tracker) objectInputStream.readObject();
            fileInputStream.close();
            objectInputStream.close();
            System.out.println("File read and closed");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }*/
}
