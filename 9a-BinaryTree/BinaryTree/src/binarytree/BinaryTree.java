/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author student
 */
public class BinaryTree {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    Node root;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        BinaryTree theTree = new BinaryTree();
        
        System.out.println("Enter tree size: ");
        int size = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < size; i++)
        {
            theTree.AddNode(i, MakeWordSet());
        }
        while (true){
            System.out.println("Which node to print? ");
            String nodeToFindS = br.readLine();

            if (nodeToFindS.equals("all"))
            {
                for (int i = 0; i < size; i++)
                {
                    System.out.println(theTree.Find(i).ToString());
                }
            }
            else if (nodeToFindS.equals("end"))
            {
                break;
            }
            else
            {
                int nodeToFind = Integer.parseInt(nodeToFindS);
                System.out.println(theTree.Find(nodeToFind).ToString());
            }
            }
    }
    
    public void AddNode(int key, String value)
    {
        Node newNode = new Node(key, value);
        
        if (root == null)
        {
            root = newNode;
        }
        else
        {
            Node focusedNode = root;
            
            Node parent;
            
            while (true)
            {
                parent = focusedNode;
                
                if (key < focusedNode.key)
                {
                    focusedNode = focusedNode.leftChild;
                    
                    if (focusedNode ==  null)
                    {
                        parent.leftChild = newNode;
                        return;
                    }
                }
                else
                {
                    focusedNode = focusedNode.rightChild;
                    
                    if (focusedNode ==  null)
                    {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }
    
    public Node Find(int key)
    {
        Node focusedNode = root;
        
        while (focusedNode.key != key)
        {
            if (key < focusedNode.key) 
            {
                focusedNode = focusedNode.leftChild;
            }
            else
            {
                focusedNode = focusedNode.rightChild;
            }
            
            if (focusedNode == null) return null;
        }
        
        return focusedNode;
    }
    
    public static String MakeWordSet() throws IOException
    {
        String[] adjectives = ReadLines("adjectives.txt");
        String[] nouns = ReadLines("nouns.txt");
        
        String adjective;
        String noun;
        
        int randomAdjective = ThreadLocalRandom.current().nextInt(0, adjectives.length);
        int randomNoun = ThreadLocalRandom.current().nextInt(0, nouns.length);
        
        adjective = adjectives[randomAdjective];
        noun = nouns[randomNoun];
        
        return  adjective + " " + noun;
    }
    
    public static String[] ReadLines(String filename) throws IOException
    {
        FileReader fileReader = new FileReader(filename);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<String> lines = new ArrayList<String>();
        
        String line = null;
        
        while ((line = bufferedReader.readLine()) != null)
        {
            lines.add(line);
        }
        
        bufferedReader.close();
        return lines.toArray(new String[lines.size()]);
    }
}

class Node{
    int key;
    String value;
    
    Node leftChild;
    Node rightChild;
    
    Node (int key, String value)
    {
        this.key = key;
        this.value = value;
    }
    
    public String ToString()
    {
        return key + ": " + value;
    }
}
