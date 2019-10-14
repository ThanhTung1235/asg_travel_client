package com.travel.config;

import city.CityService;
import city.CityServiceImplService;
import city.CityServiceImplServiceLocator;
import comment.CommentService;
import comment.CommentServiceImplServiceLocator;
import district.DistrictService;
import district.DistrictServiceImplServiceLocator;
import member.MemberService;
import member.MemberServiceImplServiceLocator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import photo.PhotoService;
import photo.PhotoServiceImplServiceLocator;
import place.PlaceService;
import place.PlaceServiceImplServiceLocator;
import rating.RatingService;
import rating.RatingServiceImplServiceLocator;

import javax.xml.rpc.ServiceException;

@Configuration
public class MyWebConfig {
    @Bean
    MemberService memberService() throws ServiceException {
        return new MemberServiceImplServiceLocator().getMemberServiceImplPort();
    }

    @Bean
    PlaceService placeService() throws ServiceException {
        return new PlaceServiceImplServiceLocator().getPlaceServiceImplPort();
    }

    @Bean
    CityService cityService() throws ServiceException {
        return new CityServiceImplServiceLocator().getCityServiceImplPort();
    }

    @Bean
    DistrictService districtService() throws ServiceException {
        return new DistrictServiceImplServiceLocator().getDistrictServiceImplPort();
    }

    @Bean
    CommentService commentService() throws ServiceException {
        return new CommentServiceImplServiceLocator().getCommentServiceImplPort();
    }

    @Bean
    RatingService ratingService() throws ServiceException {
        return new RatingServiceImplServiceLocator().getRatingServiceImplPort();
    }

    @Bean
    PhotoService photoService() throws ServiceException {
        return new PhotoServiceImplServiceLocator().getPhotoServiceImplPort();
    }
}
