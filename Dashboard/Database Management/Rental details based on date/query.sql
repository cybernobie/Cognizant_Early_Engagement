select rental_id, car_id, customer_id, km_driven
from rentals
where month(pickup_date) = 8
    and year(pickup_date) = 2019
order by rental_id;