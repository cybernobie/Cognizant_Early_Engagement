select hotel_id, hotel_name, hotel_type
from hotel_details
where hotel_id not in (select hotel_id
from orders
where month(order_date) = 5 and year(order_date) = 2019);