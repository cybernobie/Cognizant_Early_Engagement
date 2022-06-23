select student.student_name, department.department_name
from student
    inner join department
    on student.city = "Coimbatore"
        and student.department_id = department.department_id
order by student.student_name;
