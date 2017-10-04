package ratatouillerestapp.upc.edu.pe.data.db.repository;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import ratatouillerestapp.upc.edu.pe.data.db.model.DaoSession;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class QuestionRepository_Factory implements Factory<QuestionRepository> {
  private final Provider<DaoSession> daoSessionProvider;

  public QuestionRepository_Factory(Provider<DaoSession> daoSessionProvider) {
    assert daoSessionProvider != null;
    this.daoSessionProvider = daoSessionProvider;
  }

  @Override
  public QuestionRepository get() {
    return new QuestionRepository(daoSessionProvider.get());
  }

  public static Factory<QuestionRepository> create(Provider<DaoSession> daoSessionProvider) {
    return new QuestionRepository_Factory(daoSessionProvider);
  }
}
