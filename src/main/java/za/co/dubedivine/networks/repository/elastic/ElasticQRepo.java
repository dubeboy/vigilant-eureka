package za.co.dubedivine.networks.repository.elastic;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;
import za.co.dubedivine.networks.model.Question;
import za.co.dubedivine.networks.model.elastic.ElasticQuestion;

import java.awt.print.Book;
import java.util.List;

@Repository
public interface ElasticQRepo extends ElasticsearchRepository<ElasticQuestion, String> {
    List<ElasticQuestion> findByTagsName(String tagName);
//    List<ElasticQRepo> findBy
}
