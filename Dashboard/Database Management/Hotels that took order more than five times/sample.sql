select orders.hotel_id, hotel_details.hotel_name, count(orders.order_id) as no_of_orders
from orders, hotel_details
where orders.hotel_id = hotel_details.hotel_id
group by hotel_id
having count(orders.order_id) > 5;