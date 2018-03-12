package springboot.try2.course;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course,String> {

    public List<Course> findByTopicId(String topicId);
    public Course findCourseById(String courseId);
}
