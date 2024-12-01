package lab4;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        ShapeDAO shapeDAO = new ShapeDAO(sessionFactory);

        try {
            Triangle triangle = new Triangle(3,4,5, new Color(255, 255, 255, 255));
            shapeDAO.saveShape(triangle);

            Rectangle rectangle = new Rectangle(5, 100, new Color(0, 0, 0, 0));
            shapeDAO.saveShape(rectangle);

            shapeDAO.getAllShapes().forEach((Shape s) -> {System.out.println(
                    s.getClassName() + " (" + s.getId() + "): " + s + " | color: " + s.getColorDescription()
            );});

        } finally {
            shapeDAO.close();
        }
    }
}
