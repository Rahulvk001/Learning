package Learn.OopsConcepts;

interface Person2 {
    void department();

    void jobRole();
}

interface Teacher extends Person2 {
    void subject();
}

interface MathTeacher extends Person2, Teacher {
    void division();
}

