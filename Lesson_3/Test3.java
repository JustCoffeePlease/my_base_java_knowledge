
package Lesson_3;

public class Test3 {
    public static void main(String [] args){
    
    int a = 5;
    int b = a; 
    
    //int x = 1, y = 2, z = 3;
    
    
//    System.out.println(b);
    
    int x = 5;
    int y = 3;
    
//    int z = x - ++y; // ��� ����� ������ � y ������������ +1 � ���������
    int z1 = x - y++; // ��� ����� ������, ���������� y ���������� �� 1 ������
    
//    System.out.println(z1);
//    System.out.println(y);
    
    
    int n = 5; // 6(����� ++�)
               // 5(����� --�)
               // 4(����� �--)
               // 5(����� �++)
    
    int m = ++a - --a - a-- + a++; 
//            6 - 5 - 5 + 4 = 0
// ++a --> ���������� a �� ���� � ������������� ����������� ��������
// --a --> ���������� a �� ���� � ������������� ����������� ��������
// a-- --> ����������������� ������� �������� ����������, ����� ���������� �� 1
// �++ --> ����������������� ������� �������� ����������, ����� ���������� �� 1
    System.out.println(m);
    }
}