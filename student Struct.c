//Student (rollNo, name, marks) using sturcutre
#include<stdio.h>
#include<string.h>
struct Student {
    int rollno;
    int mark;
    char name[10];
};
void main() {
    struct Student s1, s2;
    s1.rollno = 13;
    strcpy(s1.name, "Janvi");
    s1.mark = 85;

    printf("Enter the details of student 2:\n");

    printf("Enter Roll No: ");
    scanf("%d", &s2.rollno);

    printf("Enter Name: ");
    scanf("%s", s2.name);

    printf("Enter Marks: ");
    scanf("%d", &s2.mark);
    
    printf("Roll No = %d\n", s1.rollno);
    printf("Name    = %s\n", s1.name);
    printf("Marks   = %d\n", s1.mark);

    printf("Roll No = %d\n", s2.rollno);
    printf("Name    = %s\n", s2.name);
    printf("Marks   = %d\n", s2.mark);


}
