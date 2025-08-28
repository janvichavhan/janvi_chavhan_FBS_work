#include <stdio.h>
struct distance {
    int feet;
    int inch;
};

void displayDistance(struct distance d);
struct distance storeDistance();

void main() {
    struct distance d1, d2, d3;

    printf("\nEnter details of Distance 1:\n");
    d1 = storeDistance();

    printf("\nEnter details of Distance 2:\n");
    d2 = storeDistance();

    printf("\nEnter details of Distance 3:\n");
    d3 = storeDistance();

    printf("\nEntered Distances are:\n");
    displayDistance(d1);
    displayDistance(d2);
    displayDistance(d3);

}

void displayDistance(struct distance d) {
    printf("Distance = %d feet %d inches\n", d.feet, d.inch);
}
struct distance storeDistance() {
    struct distance temp;
    scanf("%d", &temp.feet);
    scanf("%d", &temp.inch);

    return temp;
}
