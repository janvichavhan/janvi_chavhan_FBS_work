#include <stdio.h>
#include <string.h>

struct Task {
    int id;
    char description[100];
    char status[20];
};

struct Task tasks[20];
int taskCount = 0;   
void addTask() {
    printf("Enter Task ID: ");
    scanf("%d", &tasks[taskCount].id);

    printf("Enter Description (one word): ");
    scanf("%s", tasks[taskCount].description);

    printf("Enter Status (Pending/Done): ");
    scanf("%s", tasks[taskCount].status);

    taskCount++;
    printf("Task added!\n");
}
void updateTask() {
    int id, i, found = 0;
    printf("Enter Task ID to update: ");
    scanf("%d", &id);

    for (i = 0; i < taskCount; i++) {
        if (tasks[i].id == id) {
        printf("Enter new Description: ");
        scanf("%s", tasks[i].description);

        printf("Enter new Status: ");
        scanf("%s", tasks[i].status);

        printf("Task updated!\n");
        found = 1;
        break;
        }
    }

    if (!found) {
        printf("Task not found!\n");
    }
}
void displayTasks() {
    if (taskCount == 0) {
        printf("No tasks!\n");
        return;
    }
    for (int i = 0; i < taskCount; i++) {
        printf("\nTask ID: %d\n", tasks[i].id);
        printf("Description: %s\n", tasks[i].description);
        printf("Status: %s\n", tasks[i].status);
    }
}


void main() {
    int choice;   
    do {
        printf("\n1. Add Task\n2. Update Task\n3. Display Tasks\n4. Exit\n");
        printf("Enter choice: ");
        scanf("%d", &choice);

        if (choice == 1) addTask();
        else if (choice == 2) updateTask();
        else if (choice == 3) displayTasks();
    } while (choice != 4);

}
