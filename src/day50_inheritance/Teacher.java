package day50_inheritance;
//sub class
// child class
//derived class

import com.sun.xml.internal.bind.v2.model.core.ID;

public class Teacher extends Person  {

    int teacherID;
    public void teach (String topic) {
        System.out.println("teacher is teaching " +topic);
    }
}
