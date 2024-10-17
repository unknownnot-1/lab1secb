import java.util.Queue;

public class Main
{
	public static void main(String[] args) {
		Queue q = new linkedList();
		    for(int i=0;i<5;i++){
		        q.add(i);}
    System.out.println("elements:"+q);
    int removedeletelement=q.remove();
    System.out.println("remove:"+removedeletelement);
    System.out.println("update:"+q);
    int head= q.peek();
    System.out.println("head:"+head);
    int size=q.size();
    System.out.println("size:"+size);}}
