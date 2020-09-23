select car_id, count(car_id)
from rentals
group by car_id
order by car_id;