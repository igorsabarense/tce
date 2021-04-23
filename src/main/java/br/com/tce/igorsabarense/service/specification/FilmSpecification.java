//package br.com.tce.igorsabarense.service.specification;
//
//import org.springframework.data.jpa.domain.Specification;
//
//import javax.persistence.criteria.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class FilmSpecification implements Specification<Film> {
//    private FilmFilterDTO filter;
//
//    public  FilmSpecification(FilmFilterDTO filter){
//        this.filter = filter;
//    }
//    public FilmSpecification(){
//
//    }
//
//    @Override
//    public Predicate toPredicate(Root<Film> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
//        List<Predicate> predicates = new ArrayList<>();
//        Join<Object, Object> joinPerson = root.join("person");
//
//        query.distinct(true);
//        query.groupBy(root.get("id"));
//
//        if(filter!=null){
//
//           if(filter.getName()!=null) {
//               predicates.add(criteriaBuilder.like(joinPerson.get("name"), filter.getName()));
//           }
//           if(filter.getCastRole()!=null) {
//               predicates.add(criteriaBuilder.equal(joinPerson.get("role"), filter.getCastRole()));
//           }
//           if(filter.getGenre()!= null){
//               predicates.add(criteriaBuilder.equal(joinPerson.get("genre"), filter.getCastRole()));
//           }
//           if(filter.getFilmTitle()!=null){
//               predicates.add(criteriaBuilder.like(root.get("title"), "%" + filter.getFilmTitle() + "%"));
//           }
//
//
//        }
//
//
//        return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
//    }
//}
