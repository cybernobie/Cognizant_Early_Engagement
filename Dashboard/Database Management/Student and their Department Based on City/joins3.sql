select s.student_name, d.department_name
from student as s
    inner join department
    on s.city = "Coimbatore"
        and s.department_id = d.department_id
order by s.student_name;