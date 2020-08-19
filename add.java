class Add{
int a,b,c;
Add(int x,int y,int z){
a=x;
b=y;
c=z;
}
void display(){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
}
class Main{
public static void main(String a[]){
Add o=new Add(2,3,4);
System.out.println(o.display());
}
}
