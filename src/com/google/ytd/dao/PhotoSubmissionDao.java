package com.google.ytd.dao;

import java.util.List;

import com.google.ytd.model.PhotoSubmission;

public interface PhotoSubmissionDao {
  public PhotoSubmission getPhotoSubmissionsById(String batchId);

  public List<PhotoSubmission> getPhotoSubmissions(String sortBy, String sortOrder);
}