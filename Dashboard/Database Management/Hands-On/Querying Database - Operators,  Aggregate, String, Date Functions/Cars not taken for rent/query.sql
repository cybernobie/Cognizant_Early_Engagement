select car_id, car_name, car_type 
from cars
where car_id not in (select distinct car_id from rentals);