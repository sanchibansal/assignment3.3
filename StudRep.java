import java.util.*;
class StudRep{
    public static void main(String args[]){
    int i,temp,j,temp3,temp4,temp5;
    String temp2;
    String name[]=new String[3];	//string array for names pf the student
    int mark1[]=new int[3];		//array for marks in subject 1
    int mark2[]=new int[3];		//array for marks in subject 2
    int avrg[]=new int[3];		//array for average of the two subjects
    int arr[]=new int[3];
    Scanner b= new Scanner(System.in);
    System.out.println("enter roll numbers");
    for(i=0;i<arr.length;i++){			//entering roll no. to array arr[]
	arr[i]=b.nextInt();
    }
    System.out.println("enter Students name : ");
    for(i=0;i<name.length;i++){
	name[i]=b.next();			//entering names to array name[]
    }
    System.out.println("enter marks for subject 1");
    for(i=0;i<arr.length;i++){
	mark1[i]=b.nextInt();					//entering marks to array mark1[] 
    }
    System.out.println("enter marks for subject 2");
    for(i=0;i<arr.length;i++){						//entering marks to array mark2[]
        mark2[i]=b.nextInt();
    }
    for(i=0;i<arr.length;i++){
        avrg[i]=(mark1[i]+mark2[i])/2;;		//finding average
    }
    System.out.println(":");
    for(i=0;i<arr.length;i++){
	for(j=i+1;j<3;j++){			//arranging the given data roll no. wise
	    if(arr[i]>arr[j]){
		temp=arr[i];			
		arr[i]=arr[j];
		arr[j]=temp;

		temp2=name[i];			//moving the name for least roll no to temp2
		name[i]=name[j];
		name[j]=temp2;

		temp3=mark1[i];
		mark1[i]=mark1[j];		//moving marks for least roll number to temp3
		mark1[j]=temp3;

		temp4=mark2[i];
		mark2[i]=mark2[j];		//moving marks for least roll number to temp4
		mark2[j]=temp4;

		temp5=avrg[i];
		avrg[i]=avrg[j];		//moving average for least roll number to temp5
		avrg[j]=temp5;
	    }
        }
    }
    System.out.println("rollno."+"\t"+"name"+"\t"+"subject1"+"\t"+"subject2"+"\t"+"average");
    for(i=0;i<3;i++){											//displaying data in table
	System.out.println(arr[i]+"\t"+name[i]+"\t"+mark1[i]+"\t\t"+mark2[i]+"\t\t"+avrg[i]);
    }
    }
}