#include <stdio.h>
#include <string.h>
struct student {
    int rollno;
    char name[20];
    float marks;
};
void displayStudent(struct student s);
struct student storeStudent();

void  main() {
    struct student s1, s2, s3;

    printf("\nEnter details of student 1=\n");
    s1 = storeStudent();

    printf("\nEnter details of student 2=\n");
    s2 = storeStudent();

    printf("\nEnter details of student 3=\n");
    s3 = storeStudent();

    printf("\nEntered details of students are=\n");
    displayStudent(s1);
    displayStudent(s2);
    displayStudent(s3);
}
void displayStudent(struct student s) {
    printf("Roll No = %d\n", s.rollno);
    printf("Name    = %s\n", s.name);
    printf("Marks   = %.2f\n\n", s.marks);
}
struct student storeStudent() {
    struct student temp;
    scanf("%d", &temp.rollno);
    scanf("%s", temp.name);
    scanf("%f", &temp.marks);

    return temp;
}
