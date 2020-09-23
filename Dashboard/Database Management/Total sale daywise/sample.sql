select order_date, sum(order_amount) as total_sale
from orders
group by order_date;