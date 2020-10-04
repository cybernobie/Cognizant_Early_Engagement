select car_id, car_name, car_type
from cars
where car_name like "Maruthi%"
and car_type = "Sedan"
order by car_id;