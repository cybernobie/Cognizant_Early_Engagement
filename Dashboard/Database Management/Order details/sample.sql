select orders.order_id, customers.customer_name, hotel_details.hotel_name, orders.order_amount
from orders, customers, hotel_details
where orders.customer_id = customers.customer_id
    and orders.hotel_id = hotel_details.hotel_id
order by orders.order_id;