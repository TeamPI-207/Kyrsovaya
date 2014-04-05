Package javaapplication1; 
public class JavaApplication1
{
Private static float sum=0;
Private static float last_result=0;
Private static mainframe mainframe = new mainframe();
Public static  void main(String[] args)
{
mainframe.setVisible(true);
}
Public static void add(float param){
sum += param;
}
Public static void setSum(float sum)
{
JavaApplication1.sum = sum;
}
Public static float getSum()
{
Return sum;
}
Public static float getLast_result()
{
Return last_result;
}
Public static void setLast_result(float last_result)
{
JavaApplication1.last_result = last_result;
}
}
