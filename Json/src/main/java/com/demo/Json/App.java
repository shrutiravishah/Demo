package com.demo.Json;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	//read json file data to String
    //   	File bookJsonfile = new File("D:\\Demo\\Json\\book.json");
    	
       	//create ObjectMapper instance
    	ObjectMapper mapper = new ObjectMapper();
    	ObjectMapper mapperUser = new ObjectMapper();
       	
    	//convert json string to object
    //	Book[] books = mapper.readValue(bookJsonfile,Book[].class);
  //  	BookList bookList = new BookList();
    	List<Book> listBooks = mapper.readValue(new File("D:\\Demo\\Json\\book.json"),new TypeReference <List<Book>>() {});
    //	bookList = (BookList) books;
    	List<User> listUser = mapperUser.readValue(new File("D:\\Demo\\Json\\user.json"),new TypeReference <List<User>>() {});
    	
    	System.out.println("Book Object" + listBooks);
    //	System.out.println(Arrays.asList(books));
    	
    	System.out.println("User Object" + listUser);
    
    	int i=0;
		System.out.println("\n Available Books");

    	for(i=0;i<listBooks.size();i++)
    	{
    		if(listBooks.get(i).getUser()== null)
    		{
    			System.out.println(listBooks.get(i).getId());
    			System.out.println(listBooks.get(i).getName());
    			System.out.println(listBooks.get(i).getUser());
    		}
    	}
    	
    	
    	System.out.println("\n Issued Books");
    	for(i=0;i<listBooks.size();i++)
    	{
    		if(listBooks.get(i).getUser()!= null)
    		{
    			System.out.println(listBooks.get(i).getId());
    			System.out.println(listBooks.get(i).getName());
    		}
    	}
    	
    	// Search for books enquired by user , using User ID
    	
    	int usrID = 0;
    	int noUser = 0;
    	Scanner usrSC= new Scanner(System.in);    //System.in is a standard input stream  
   	
    	System.out.println("\n Enter User ID");
    	usrID= usrSC.nextInt();  

    	 	
    	for(i=0;i<listBooks.size();i++)
    	{
    		if(listBooks.get(i).getUser()== usrID)
    		{
    			System.out.println(listBooks.get(i).getId());
    			System.out.println(listBooks.get(i).getName());
    			noUser = 0;
    			break;
    		}
    		else 
    		{
    			noUser = 1;
    		}
    	}
    	
    	if(noUser == 1)
    	{
    		System.out.println("\n The book requested is not available");
    	}
    	
    	/* Get user ID and Book ID from user and check for allotment */
    	    	
    	int bookID = 0;
    	usrID = 0;
    	noUser = 0;
    	Scanner usrSC1= new Scanner(System.in);    //System.in is a standard input stream  
   	
    	System.out.println("\n Enter User ID");
    	usrID= usrSC1.nextInt();  
    	
    	System.out.println("\n Enter Book ID");
    	bookID= usrSC1.nextInt();  
    	
    	
     	int allotFlag = 0;
    	for(i=0;i<listBooks.size();i++)
    	{
    		if(listBooks.get(i).getId()== bookID)
    		{
    			//for(i=0;i<listBooks.size();i++)
    	    	
    	    		if(listBooks.get(i).getUser()== 0)
    	    		{
    	    			listBooks.get(i).setUser(usrID);
    	    			System.out.println("\n Congratulations Book alloted to you is ");
    	    			System.out.println(listBooks.get(i).getName());
    	    			allotFlag = 0;
    	    			break;
    	     		}
    	    		
    		}
    		else
    		{
    			allotFlag = 1;
    			
    		}
    	}		
    		    	
    	if(allotFlag == 1)
    	{
    		System.out.println("Book already alloted ");
    	}
    	
    	
    	
    	
    	/*2
    	JSONParser jsonParser = new JSONParser();
    	try(FileReader reader = new FileReader("book.json"))
    	{
    		//Read JSON file
    		Object object = jsonParser.parse(reader);
    	 	JSONArray bookList = (JSONArray) object;
    		System.out.println(bookList);
    		bookList.forEach(book ->{
    			JSONObject books = (JSONObject) book;
    			System.out.println("Book id : "+ books.get("id"));
    			System.out.println("Book name : "+ books.get("name"));
    			System.out.println("User : " + books.get("user"));
    		});
    		
    	} catch (FileNotFoundException e) {
    		e.printStackTrace();
    	} catch (IOException e) {
			e.printStackTrace();
		} catch (org.json.simple.parser.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	*/
    	
    }
    
       
    /*
    final Book book = new Book();
   
    book.setId(1);
    book.setName("book1");
    book.setUser(1);
    
    final Book book1 = new Book();
    book1.setId(2);
    book1.setName("book2");
    book1.setUser(2);
    
    final User user = new User();
    user.setId(1);
    user.setName("user1");
    
    final User user1 = new User();
    user1.setId(2);
    user1.setName("user2");
    
    System.out.println("Book -> "+ book);
    System.out.println("Book -> "+ book1);
    System.out.println("USer -> " + user);
    System.out.println("USer -> " + user1);
  
	
	try {
		ObjectMapper mapper = new ObjectMapper();
		TypeReference<Book> ref = new TypeReference<Book>() { };
		InputStream in = new FileInputStream("D:\\Demo\\Json\\src\\main\\resources\\schema\\book.json");
		Book book = mapper.readValue(in, ref);
		System.out.println("Book name:"+book.getName());
	
	}
	catch (Exception e) {
		e.printStackTrace();
	}*/
	
    
    
    
}
