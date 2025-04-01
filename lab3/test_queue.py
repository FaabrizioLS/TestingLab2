from my_queue import Queue
from hypothesis import given, strategies as st
import pytest

@given(st.integers(min_value=1, max_value=1000))
def test_queue_initially_empty(size_max):
    q = Queue(size_max)
    assert q.empty() is True
    assert q.full() is False

@given(st.integers(min_value=1, max_value=1000), st.integers())
def test_enqueue_makes_queue_non_empty(size_max, element):
    q = Queue(size_max)
    q.enqueue(element)
    assert q.empty() is False

