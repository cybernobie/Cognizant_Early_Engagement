select concat(hotel_name, ' is a ', hotel_type, ' hotel') as hotel_info
from hotel_details
order by hotel_name desc;