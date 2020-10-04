select distinct hotel_details.hotel_id, hotel_details.hotel_name, hotel_details.rating
from hotel_details, orders
where hotel_details.hotel_id = orders.hotel_id
    and month(orders.order_date) = 7
order by hotel_details.hotel_id;