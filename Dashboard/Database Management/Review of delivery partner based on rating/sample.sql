select partner_id, partner_name, (
    case
    when rating >= 4 then "GOOD"
    when rating >= 2 and rating < 4 then "AVERAGE"
    else "WORST"
    end
) as review
from delivery_partners
order by partner_id;