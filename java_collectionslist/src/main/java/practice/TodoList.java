package practice;

import java.util.ArrayList;

public class TodoList {
    ArrayList <String> todoList = new ArrayList<>();

    public void add(String todo) {
        todoList.add(todo);
        System.out.println("Добавлено дело " + todo);

        // TODO: добавьте переданное дело в конец списка
    }

    public void add(int index, String todo) {
        if (index<todoList.size()){
            todoList.add(index,todo);
            System.out.println("Добавлено дело " + todo);
        } else {
            todoList.add(todo);
            System.out.println(("Добавлено дело " + todo));
        }
        // TODO: добавьте дело на указаный индекс,
        //  проверьте возможность добавления
    }

    public void edit(int index, String todo) {
        if (index<todoList.size()){
            todoList.set(index,todo);
            System.out.println("Дело " + todoList.get(index) + " заменено на " + todo);
        } else {
            System.out.println("Несуществующий индекс");
        }

        // TODO: заменить дело на index переданным todo индекс,
        //  проверьте возможность изменения
    }

    public void delete(int index) {
        if (index<todoList.size()){
            System.out.println("Дело " + todoList.get(index));
            todoList.remove(index);
            System.out.print("удалено");
        }
        // TODO: удалить дело находящееся по переданному индексу,
        //  проверьте возможность удаления дела
    }

    public ArrayList<String> getTodos() {
        for (int i=0; i < todoList.size(); i++){
            System.out.println(i + " - " + todoList.get(i));
        }
        // TODO: вернуть список дел
        return todoList;
    }

}