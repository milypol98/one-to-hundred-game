package pl.milypol.dailyhelper.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.milypol.dailyhelper.entity.IncomingOrder;

public interface IncomingOrdersRepository extends JpaRepository<IncomingOrder , Long> {
}
