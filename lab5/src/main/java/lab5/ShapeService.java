package lab5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;

@Service
public class ShapeService {

    private final RectangleRepository rectangleRepository;
    private final TriangleRepository triangleRepository;

    @Autowired
    public ShapeService(RectangleRepository rectangleRepository, TriangleRepository triangleRepository) {
        this.rectangleRepository = rectangleRepository;
        this.triangleRepository = triangleRepository;
    }

    public Shape saveShape(Shape shape) {
        if (shape instanceof Rectangle) {
            return rectangleRepository.save((Rectangle) shape);
        } else if (shape instanceof Triangle) {
            return triangleRepository.save((Triangle) shape);
        } else {
            throw new IllegalArgumentException("Unknown shape type");
        }
    }

    public List<Shape> getAllShapes() {
        List<Shape> allShapes = new ArrayList<>();
        allShapes.addAll(rectangleRepository.findAll());
        allShapes.addAll(triangleRepository.findAll());
        return allShapes;
    }
}
