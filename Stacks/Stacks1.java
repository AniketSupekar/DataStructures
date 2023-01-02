import java.nio.file.WatchService;
import java.util.Scanner;

class Stacks1{
	int a[];
	int top = -1;
	int size;
	Stacks1(int n){
	
		a = new int[n];
		top = -1;
		size = n;
	}
	int StackEmpty(){
	
		if(top == -1)
			return 1;
		else
			return 0;
	}
	int StackFull(){
	
		if(top == size - 1)
			return 1;
		else 
			return 0;
	}
	void push(int no){
        if(StackFull() == 1)
        System.out.println("Stack is already full");
    else{
        top = top + 1;
        a[top] = no;
    }
}

void pop(){
    if(StackEmpty() == 1)
        System.out.println("Stack is empty");
    else{
        int i = a[top];
        top = top-1;
    }
}
void display(){

    int i = top;
    if(StackEmpty()==1)
        System.out.println("Stack is empty");
    else{
        for(i=top; i>=0; i--)
            System.out.println(a[i]);
    }
}
public static void main(String[] args){
	
    Stacks1 s = new Stacks1(5);
    Scanner sc = new Scanner(System.in);
    int c;
    do{
        System.out.println("Press 1 for push");
        System.out.println("Press 2 for pop");
        System.out.println("Press 3 for display");
        int choice = sc.nextInt();
        switch(choice) {
            case 1 :
            System.out.println("Enter the element you want to add in stack");
            int a = sc.nextInt();
            s.push(a);
            break;
    
            case 2 :
            s.pop();
            break;
    
            case 3 :
            s.display();
            break;
    
            default :
            System.out.println("Enter the valid choice");
            break;
        }
        System.out.println("Press 1 to continue");
        System.out.println("Press 0 to exit");
        c = sc.nextInt();
    }while(c==1);
}
}