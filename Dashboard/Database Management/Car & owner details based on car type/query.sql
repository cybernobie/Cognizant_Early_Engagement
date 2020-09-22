select car_id, car_name, owner_id
from cars
where car_type in ("Hatchback", "SUV")
order by car_id;