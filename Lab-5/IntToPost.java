import java.util.*;
class ITP {
    static int top=0;
    static char stack[]=new char[100];
    static void push(char c)
    {
        if (top>= 100) {
            System.out.println("Stack overflow");
        }
        else
        {
            top=top+1;
            stack[top]=c;
        }
    }
    static char pop()
    {
        if (top==0) {
            System.out.println(" Stack Underflow");
            return 0;
        }
        else
        {
            top--;
            return stack[top+1];

        }
    }
    static char peek()
    {
        if (top==0) {
            System.out.println(" Stack Underflow");
            return 0;
        }
        else
        {
            return stack[top];
        }
    }
    char precedence(char symbole)
    {
        switch(symbole)
        {
            case'+':
            case'-':
                return 1;
                break;
            case'*':
            case'/':
                return 2;
                break;
            case'^':
            case'%':
                return 3;
                break;
            case '(':
                return 4;
                break;
            default :
                return 0;
                break;
        }

    }
    String topostfix(String input)
    {
        char symbole;
        String postfix="";
        for (int i = 1; i < input.length(); i++) 
        {
            symbole=input.charAt(i);
            if(Character.isLetter(symbole))
            {
                postfix=postfix+symbole;
            }
            else if(symbole=='(')
            {
                push(symbole);
            }
            else if(symbole==')')
            {
                while(peek()!='(')
                {
                    postfix=postfix+pop(symbole);
                }
                pop();
            }
            else
            { 
                while(precedence(symbole)<=precedence(peek(symbole)))
                {
                     postfix=postfix+pop();
                }
                push(symbole);
            }
        }
        while(top==0 || peek()!='(')
        {
            postfix=postfix+pop(symbole);
        }
        return postfix;
    }
}

class IntToPost{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        ITP ps=new ITP();
        System.out.println("Enter infix String : ");
        String input= sc.nextLine();
        System.out.println("Postfix String=");
        ps.topostfix(input);
    }    
}


