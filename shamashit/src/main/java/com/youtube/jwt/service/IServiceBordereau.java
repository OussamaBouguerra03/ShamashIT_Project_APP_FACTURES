package com.youtube.jwt.service;

import java.util.List;

import com.youtube.jwt.entity.Bordereau;

public interface IServiceBordereau {
public void SaisirBordereau(Bordereau bordereau);
List<Bordereau> findall();

void update(Bordereau v);


}
