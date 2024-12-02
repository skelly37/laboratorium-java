package lab5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping("/api/shapes")
public class ShapeController {

    @Autowired
    private RectangleRepository rectangleRepository;

    @Autowired
    private TriangleRepository triangleRepository;

    @GetMapping
    public List<Shape> getAllShapes() {
        List<Shape> allShapes = new ArrayList<>();
        allShapes.addAll(rectangleRepository.findAll());
        allShapes.addAll(triangleRepository.findAll());
        return allShapes;
    }

    @PostMapping("/rectangle")
    public Rectangle createRectangle(@RequestBody Rectangle rectangle) {
        return rectangleRepository.save(rectangle);
    }

    @PostMapping("/triangle")
    public Triangle createTriangle(@RequestBody Triangle triangle) {
        return triangleRepository.save(triangle);
    }
}


