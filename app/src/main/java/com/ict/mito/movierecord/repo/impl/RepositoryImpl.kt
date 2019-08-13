package com.ict.mito.movierecord.repo.impl

import com.ict.mito.movierecord.domain.MovieItem
import com.ict.mito.movierecord.domain.db.dao.MovieDAO
import com.ict.mito.movierecord.repo.Repository
import io.reactivex.Single

/**
 * Created by mitohato14 on 2019-08-13.
 */
class RepositoryImpl(private val dao: MovieDAO) : Repository {
    override fun getAllMovie(): Single<List<MovieItem>> = dao.getAllMovie()

    override fun add(movieItem: MovieItem) = dao.insert(movieItem)
}