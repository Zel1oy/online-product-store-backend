package com.example.onlinebookstore.mapper;

import com.example.onlinebookstore.config.MapperConfig;
import com.example.onlinebookstore.dto.book.BookDto;
import com.example.onlinebookstore.dto.book.CreateBookRequestDto;
import com.example.onlinebookstore.model.Book;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

@Mapper(config = MapperConfig.class)
public interface BookMapper {
    BookDto toDto(Book book);

    Book toModel(CreateBookRequestDto requestDto);

    Book toEntity(CreateBookRequestDto bookDto);
    BookDtoWithoutCategoryIds toDtoWithoutCategories(Book book); (HINT: BookDtoWithoutCategoryIds class could be used as a response class for @GetMapping("/{id}/books") endpoint)
    @AfterMapping
    default void setCategoryIds(@MappingTarget BookDto bookDto, Book book);
    @Named("bookFromId") default Book bookFromId(Long id);
}
